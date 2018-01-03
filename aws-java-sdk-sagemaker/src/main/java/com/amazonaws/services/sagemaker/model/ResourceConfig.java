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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the resources, including ML compute instances and ML storage volumes, to use for model training.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ResourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of ML compute instances to use. For distributed training, provide a value greater than 1.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The size of the ML storage volume that you want to provision.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML
     * storage volume for scratch space. If you want to store the training data in the ML storage volume, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     * </p>
     * <p>
     * You must specify sufficient ML storage for your scenario.
     * </p>
     * <note>
     * <p>
     * Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage volume type.
     * </p>
     * </note>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type.
     * @see TrainingInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * 
     * @return The ML compute instance type.
     * @see TrainingInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public ResourceConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public ResourceConfig withInstanceType(TrainingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of ML compute instances to use. For distributed training, provide a value greater than 1.
     * </p>
     * 
     * @param instanceCount
     *        The number of ML compute instances to use. For distributed training, provide a value greater than 1.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use. For distributed training, provide a value greater than 1.
     * </p>
     * 
     * @return The number of ML compute instances to use. For distributed training, provide a value greater than 1.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use. For distributed training, provide a value greater than 1.
     * </p>
     * 
     * @param instanceCount
     *        The number of ML compute instances to use. For distributed training, provide a value greater than 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The size of the ML storage volume that you want to provision.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML
     * storage volume for scratch space. If you want to store the training data in the ML storage volume, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     * </p>
     * <p>
     * You must specify sufficient ML storage for your scenario.
     * </p>
     * <note>
     * <p>
     * Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage volume type.
     * </p>
     * </note>
     * 
     * @param volumeSizeInGB
     *        The size of the ML storage volume that you want to provision. </p>
     *        <p>
     *        ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML
     *        storage volume for scratch space. If you want to store the training data in the ML storage volume, choose
     *        <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     *        </p>
     *        <p>
     *        You must specify sufficient ML storage for your scenario.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage volume type.
     *        </p>
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size of the ML storage volume that you want to provision.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML
     * storage volume for scratch space. If you want to store the training data in the ML storage volume, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     * </p>
     * <p>
     * You must specify sufficient ML storage for your scenario.
     * </p>
     * <note>
     * <p>
     * Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage volume type.
     * </p>
     * </note>
     * 
     * @return The size of the ML storage volume that you want to provision. </p>
     *         <p>
     *         ML storage volumes store model artifacts and incremental states. Training algorithms might also use the
     *         ML storage volume for scratch space. If you want to store the training data in the ML storage volume,
     *         choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     *         </p>
     *         <p>
     *         You must specify sufficient ML storage for your scenario.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage volume type.
     *         </p>
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The size of the ML storage volume that you want to provision.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML
     * storage volume for scratch space. If you want to store the training data in the ML storage volume, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     * </p>
     * <p>
     * You must specify sufficient ML storage for your scenario.
     * </p>
     * <note>
     * <p>
     * Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage volume type.
     * </p>
     * </note>
     * 
     * @param volumeSizeInGB
     *        The size of the ML storage volume that you want to provision. </p>
     *        <p>
     *        ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML
     *        storage volume for scratch space. If you want to store the training data in the ML storage volume, choose
     *        <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     *        </p>
     *        <p>
     *        You must specify sufficient ML storage for your scenario.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage volume type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceConfig withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceConfig == false)
            return false;
        ResourceConfig other = (ResourceConfig) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        return hashCode;
    }

    @Override
    public ResourceConfig clone() {
        try {
            return (ResourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ResourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
