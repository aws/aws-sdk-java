/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The configuration for hyperparameter tuning resources for use in training jobs launched by the tuning job. These
 * resources include compute instances and storage volumes. Specify one or more compute instance configurations and
 * allocation strategies to select resources (optional).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTuningInstanceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningInstanceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose (no GPUs)
     * instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs) instance types:
     * ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html">instance type
     * descriptions</a>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of instances of the type specified by <code>InstanceType</code>. Choose an instance count larger than
     * 1 for distributed training algorithms. See <a
     * href="https://docs.aws.amazon.com/data-parallel-use-api.html">SageMaker distributed training jobs</a> for more
     * informcration.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The volume size in GB of the data to be processed for hyperparameter optimization (optional).
     * </p>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose (no GPUs)
     * instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs) instance types:
     * ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html">instance type
     * descriptions</a>.
     * </p>
     * 
     * @param instanceType
     *        The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose (no
     *        GPUs) instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs)
     *        instance types: ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html">instance
     *        type descriptions</a>.
     * @see TrainingInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose (no GPUs)
     * instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs) instance types:
     * ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html">instance type
     * descriptions</a>.
     * </p>
     * 
     * @return The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose
     *         (no GPUs) instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs)
     *         instance types: ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html">instance
     *         type descriptions</a>.
     * @see TrainingInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose (no GPUs)
     * instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs) instance types:
     * ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html">instance type
     * descriptions</a>.
     * </p>
     * 
     * @param instanceType
     *        The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose (no
     *        GPUs) instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs)
     *        instance types: ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html">instance
     *        type descriptions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public HyperParameterTuningInstanceConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose (no GPUs)
     * instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs) instance types:
     * ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html">instance type
     * descriptions</a>.
     * </p>
     * 
     * @param instanceType
     *        The instance type used for processing of hyperparameter optimization jobs. Choose from general purpose (no
     *        GPUs) instance types: ml.m5.xlarge, ml.m5.2xlarge, and ml.m5.4xlarge or compute optimized (no GPUs)
     *        instance types: ml.c5.xlarge and ml.c5.2xlarge. For more information about instance types, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html">instance
     *        type descriptions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public HyperParameterTuningInstanceConfig withInstanceType(TrainingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances of the type specified by <code>InstanceType</code>. Choose an instance count larger than
     * 1 for distributed training algorithms. See <a
     * href="https://docs.aws.amazon.com/data-parallel-use-api.html">SageMaker distributed training jobs</a> for more
     * informcration.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances of the type specified by <code>InstanceType</code>. Choose an instance count
     *        larger than 1 for distributed training algorithms. See <a
     *        href="https://docs.aws.amazon.com/data-parallel-use-api.html">SageMaker distributed training jobs</a> for
     *        more informcration.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances of the type specified by <code>InstanceType</code>. Choose an instance count larger than
     * 1 for distributed training algorithms. See <a
     * href="https://docs.aws.amazon.com/data-parallel-use-api.html">SageMaker distributed training jobs</a> for more
     * informcration.
     * </p>
     * 
     * @return The number of instances of the type specified by <code>InstanceType</code>. Choose an instance count
     *         larger than 1 for distributed training algorithms. See <a
     *         href="https://docs.aws.amazon.com/data-parallel-use-api.html">SageMaker distributed training jobs</a> for
     *         more informcration.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances of the type specified by <code>InstanceType</code>. Choose an instance count larger than
     * 1 for distributed training algorithms. See <a
     * href="https://docs.aws.amazon.com/data-parallel-use-api.html">SageMaker distributed training jobs</a> for more
     * informcration.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances of the type specified by <code>InstanceType</code>. Choose an instance count
     *        larger than 1 for distributed training algorithms. See <a
     *        href="https://docs.aws.amazon.com/data-parallel-use-api.html">SageMaker distributed training jobs</a> for
     *        more informcration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningInstanceConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The volume size in GB of the data to be processed for hyperparameter optimization (optional).
     * </p>
     * 
     * @param volumeSizeInGB
     *        The volume size in GB of the data to be processed for hyperparameter optimization (optional).
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The volume size in GB of the data to be processed for hyperparameter optimization (optional).
     * </p>
     * 
     * @return The volume size in GB of the data to be processed for hyperparameter optimization (optional).
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The volume size in GB of the data to be processed for hyperparameter optimization (optional).
     * </p>
     * 
     * @param volumeSizeInGB
     *        The volume size in GB of the data to be processed for hyperparameter optimization (optional).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningInstanceConfig withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
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

        if (obj instanceof HyperParameterTuningInstanceConfig == false)
            return false;
        HyperParameterTuningInstanceConfig other = (HyperParameterTuningInstanceConfig) obj;
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
    public HyperParameterTuningInstanceConfig clone() {
        try {
            return (HyperParameterTuningInstanceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTuningInstanceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
