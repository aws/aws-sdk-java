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
 * Provides information used to select Amazon Machine Images (AMIs) for instances in the compute environment. If the
 * <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL1</code>.
 * </p>
 * <note>
 * <p>
 * This object isn't applicable to jobs running on Fargate resources.
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
     * The image type to match with the instance type to select an AMI. If the <code>imageIdOverride</code> parameter
     * isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * AMI</a> is used.
     * </p>
     * <dl>
     * <dt>ECS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon Linux
     * 2</a>− Default for all AWS Graviton-based instance families (for example, <code>C6g</code>, <code>M6g</code>,
     * <code>R6g</code>, and <code>T4g</code>) and can be used for all non-GPU instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon Linux
     * 2 (GPU)</a>−Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>) and can be
     * used for all non-AWS Graviton-based instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL1</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     * Linux</a>−Default for all non-GPU, non-AWS Graviton instance families. Amazon Linux is reaching the end-of-life
     * of standard support. For more information, see <a href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux
     * AMI</a>.
     * </p>
     * </dd>
     * </dl>
     */
    private String imageType;
    /**
     * <p>
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting
     * overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     * </p>
     */
    private String imageIdOverride;

    /**
     * <p>
     * The image type to match with the instance type to select an AMI. If the <code>imageIdOverride</code> parameter
     * isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * AMI</a> is used.
     * </p>
     * <dl>
     * <dt>ECS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon Linux
     * 2</a>− Default for all AWS Graviton-based instance families (for example, <code>C6g</code>, <code>M6g</code>,
     * <code>R6g</code>, and <code>T4g</code>) and can be used for all non-GPU instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon Linux
     * 2 (GPU)</a>−Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>) and can be
     * used for all non-AWS Graviton-based instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL1</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     * Linux</a>−Default for all non-GPU, non-AWS Graviton instance families. Amazon Linux is reaching the end-of-life
     * of standard support. For more information, see <a href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux
     * AMI</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param imageType
     *        The image type to match with the instance type to select an AMI. If the <code>imageIdOverride</code>
     *        parameter isn't specified, then a recent <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized AMI</a> is used.</p>
     *        <dl>
     *        <dt>ECS_AL2</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     *        Linux 2</a>− Default for all AWS Graviton-based instance families (for example, <code>C6g</code>,
     *        <code>M6g</code>, <code>R6g</code>, and <code>T4g</code>) and can be used for all non-GPU instance types.
     *        </p>
     *        </dd>
     *        <dt>ECS_AL2_NVIDIA</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon
     *        Linux 2 (GPU)</a>−Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>)
     *        and can be used for all non-AWS Graviton-based instance types.
     *        </p>
     *        </dd>
     *        <dt>ECS_AL1</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     *        Linux</a>−Default for all non-GPU, non-AWS Graviton instance families. Amazon Linux is reaching the
     *        end-of-life of standard support. For more information, see <a
     *        href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     *        </p>
     *        </dd>
     */

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     * <p>
     * The image type to match with the instance type to select an AMI. If the <code>imageIdOverride</code> parameter
     * isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * AMI</a> is used.
     * </p>
     * <dl>
     * <dt>ECS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon Linux
     * 2</a>− Default for all AWS Graviton-based instance families (for example, <code>C6g</code>, <code>M6g</code>,
     * <code>R6g</code>, and <code>T4g</code>) and can be used for all non-GPU instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon Linux
     * 2 (GPU)</a>−Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>) and can be
     * used for all non-AWS Graviton-based instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL1</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     * Linux</a>−Default for all non-GPU, non-AWS Graviton instance families. Amazon Linux is reaching the end-of-life
     * of standard support. For more information, see <a href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux
     * AMI</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The image type to match with the instance type to select an AMI. If the <code>imageIdOverride</code>
     *         parameter isn't specified, then a recent <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *         ECS-optimized AMI</a> is used.</p>
     *         <dl>
     *         <dt>ECS_AL2</dt>
     *         <dd>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     *         Linux 2</a>− Default for all AWS Graviton-based instance families (for example, <code>C6g</code>,
     *         <code>M6g</code>, <code>R6g</code>, and <code>T4g</code>) and can be used for all non-GPU instance types.
     *         </p>
     *         </dd>
     *         <dt>ECS_AL2_NVIDIA</dt>
     *         <dd>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon
     *         Linux 2 (GPU)</a>−Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>)
     *         and can be used for all non-AWS Graviton-based instance types.
     *         </p>
     *         </dd>
     *         <dt>ECS_AL1</dt>
     *         <dd>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     *         Linux</a>−Default for all non-GPU, non-AWS Graviton instance families. Amazon Linux is reaching the
     *         end-of-life of standard support. For more information, see <a
     *         href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     *         </p>
     *         </dd>
     */

    public String getImageType() {
        return this.imageType;
    }

    /**
     * <p>
     * The image type to match with the instance type to select an AMI. If the <code>imageIdOverride</code> parameter
     * isn't specified, then a recent <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * AMI</a> is used.
     * </p>
     * <dl>
     * <dt>ECS_AL2</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon Linux
     * 2</a>− Default for all AWS Graviton-based instance families (for example, <code>C6g</code>, <code>M6g</code>,
     * <code>R6g</code>, and <code>T4g</code>) and can be used for all non-GPU instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL2_NVIDIA</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon Linux
     * 2 (GPU)</a>−Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>) and can be
     * used for all non-AWS Graviton-based instance types.
     * </p>
     * </dd>
     * <dt>ECS_AL1</dt>
     * <dd>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     * Linux</a>−Default for all non-GPU, non-AWS Graviton instance families. Amazon Linux is reaching the end-of-life
     * of standard support. For more information, see <a href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux
     * AMI</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param imageType
     *        The image type to match with the instance type to select an AMI. If the <code>imageIdOverride</code>
     *        parameter isn't specified, then a recent <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized AMI</a> is used.</p>
     *        <dl>
     *        <dt>ECS_AL2</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami">Amazon
     *        Linux 2</a>− Default for all AWS Graviton-based instance families (for example, <code>C6g</code>,
     *        <code>M6g</code>, <code>R6g</code>, and <code>T4g</code>) and can be used for all non-GPU instance types.
     *        </p>
     *        </dd>
     *        <dt>ECS_AL2_NVIDIA</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami">Amazon
     *        Linux 2 (GPU)</a>−Default for all GPU instance families (for example <code>P4</code> and <code>G4</code>)
     *        and can be used for all non-AWS Graviton-based instance types.
     *        </p>
     *        </dd>
     *        <dt>ECS_AL1</dt>
     *        <dd>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami">Amazon
     *        Linux</a>−Default for all non-GPU, non-AWS Graviton instance families. Amazon Linux is reaching the
     *        end-of-life of standard support. For more information, see <a
     *        href="http://aws.amazon.com/amazon-linux-ami/">Amazon Linux AMI</a>.
     *        </p>
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
     * 
     * @param imageIdOverride
     *        The AMI ID used for instances launched in the compute environment that match the image type. This setting
     *        overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     */

    public void setImageIdOverride(String imageIdOverride) {
        this.imageIdOverride = imageIdOverride;
    }

    /**
     * <p>
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting
     * overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     * </p>
     * 
     * @return The AMI ID used for instances launched in the compute environment that match the image type. This setting
     *         overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     */

    public String getImageIdOverride() {
        return this.imageIdOverride;
    }

    /**
     * <p>
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting
     * overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     * </p>
     * 
     * @param imageIdOverride
     *        The AMI ID used for instances launched in the compute environment that match the image type. This setting
     *        overrides the <code>imageId</code> set in the <code>computeResource</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Configuration withImageIdOverride(String imageIdOverride) {
        setImageIdOverride(imageIdOverride);
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
            sb.append("ImageIdOverride: ").append(getImageIdOverride());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageType() == null) ? 0 : getImageType().hashCode());
        hashCode = prime * hashCode + ((getImageIdOverride() == null) ? 0 : getImageIdOverride().hashCode());
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
