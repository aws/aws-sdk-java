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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the resources, including ML instance types and ML instance count, to use for transform job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TransformResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformResources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ML compute instance type for the transform job. For using built-in algorithms to transform moderately sized
     * datasets, ml.m4.xlarge or <code>ml.m5.large</code> should suffice. There is no default value for
     * <code>InstanceType</code>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of ML compute instances to use in the transform job. For distributed transform, provide a value
     * greater than 1. The default value is <code>1</code>.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the batch transform job. The <code>VolumeKmsKeyId</code> can be
     * any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * The ML compute instance type for the transform job. For using built-in algorithms to transform moderately sized
     * datasets, ml.m4.xlarge or <code>ml.m5.large</code> should suffice. There is no default value for
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type for the transform job. For using built-in algorithms to transform moderately
     *        sized datasets, ml.m4.xlarge or <code>ml.m5.large</code> should suffice. There is no default value for
     *        <code>InstanceType</code>.
     * @see TransformInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The ML compute instance type for the transform job. For using built-in algorithms to transform moderately sized
     * datasets, ml.m4.xlarge or <code>ml.m5.large</code> should suffice. There is no default value for
     * <code>InstanceType</code>.
     * </p>
     * 
     * @return The ML compute instance type for the transform job. For using built-in algorithms to transform moderately
     *         sized datasets, ml.m4.xlarge or <code>ml.m5.large</code> should suffice. There is no default value for
     *         <code>InstanceType</code>.
     * @see TransformInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The ML compute instance type for the transform job. For using built-in algorithms to transform moderately sized
     * datasets, ml.m4.xlarge or <code>ml.m5.large</code> should suffice. There is no default value for
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type for the transform job. For using built-in algorithms to transform moderately
     *        sized datasets, ml.m4.xlarge or <code>ml.m5.large</code> should suffice. There is no default value for
     *        <code>InstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformInstanceType
     */

    public TransformResources withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ML compute instance type for the transform job. For using built-in algorithms to transform moderately sized
     * datasets, ml.m4.xlarge or <code>ml.m5.large</code> should suffice. There is no default value for
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceType
     *        The ML compute instance type for the transform job. For using built-in algorithms to transform moderately
     *        sized datasets, ml.m4.xlarge or <code>ml.m5.large</code> should suffice. There is no default value for
     *        <code>InstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformInstanceType
     */

    public TransformResources withInstanceType(TransformInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of ML compute instances to use in the transform job. For distributed transform, provide a value
     * greater than 1. The default value is <code>1</code>.
     * </p>
     * 
     * @param instanceCount
     *        The number of ML compute instances to use in the transform job. For distributed transform, provide a value
     *        greater than 1. The default value is <code>1</code>.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use in the transform job. For distributed transform, provide a value
     * greater than 1. The default value is <code>1</code>.
     * </p>
     * 
     * @return The number of ML compute instances to use in the transform job. For distributed transform, provide a
     *         value greater than 1. The default value is <code>1</code>.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use in the transform job. For distributed transform, provide a value
     * greater than 1. The default value is <code>1</code>.
     * </p>
     * 
     * @param instanceCount
     *        The number of ML compute instances to use in the transform job. For distributed transform, provide a value
     *        greater than 1. The default value is <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformResources withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the batch transform job. The <code>VolumeKmsKeyId</code> can be
     * any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that run the batch transform job. The
     *        <code>VolumeKmsKeyId</code> can be any of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the batch transform job. The <code>VolumeKmsKeyId</code> can be
     * any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *         volume attached to the ML compute instance(s) that run the batch transform job. The
     *         <code>VolumeKmsKeyId</code> can be any of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         // KMS Key ID
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that run the batch transform job. The <code>VolumeKmsKeyId</code> can be
     * any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that run the batch transform job. The
     *        <code>VolumeKmsKeyId</code> can be any of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformResources withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
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
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformResources == false)
            return false;
        TransformResources other = (TransformResources) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public TransformResources clone() {
        try {
            return (TransformResources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TransformResourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
