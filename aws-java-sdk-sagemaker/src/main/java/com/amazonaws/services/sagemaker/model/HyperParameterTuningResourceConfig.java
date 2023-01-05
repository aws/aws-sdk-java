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
 * The configuration of resources, including compute instances and storage volumes for use in training jobs launched by
 * hyperparameter tuning jobs. <code>HyperParameterTuningResourceConfig</code> is similar to <code>ResourceConfig</code>
 * , but has the additional <code>InstanceConfigs</code> and <code>AllocationStrategy</code> fields to allow for
 * flexible instance management. Specify one or more instance types, count, and the allocation strategy for instance
 * selection.
 * </p>
 * <note>
 * <p>
 * <code>HyperParameterTuningResourceConfig</code> supports the capabilities of <code>ResourceConfig</code> with the
 * exception of <code>KeepAlivePeriodInSeconds</code>. Hyperparameter tuning jobs use warm pools by default, which reuse
 * clusters between training jobs.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTuningResourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningResourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type used to run hyperparameter optimization tuning jobs. See <a
     * href="https://docs.aws.amazon.com/notebooks-available-instance-types.html"> descriptions of instance types</a>
     * for more information.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of compute instances of type <code>InstanceType</code> to use. For <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/data-parallel-use-api.html">distributed training</a>,
     * select a value greater than 1.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The volume size in GB for the storage volume to be used in processing hyperparameter optimization jobs
     * (optional). These volumes store model artifacts, incremental states and optionally, scratch space for training
     * algorithms. Do not provide a value for this parameter if a value for <code>InstanceConfigs</code> is also
     * specified.
     * </p>
     * <p>
     * Some instance types have a fixed total local storage size. If you select one of these instances for training,
     * <code>VolumeSizeInGB</code> cannot be greater than this total size. For a list of instance types with local
     * instance storage and their sizes, see <a
     * href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>.
     * </p>
     * <note>
     * <p>
     * SageMaker supports only the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">General Purpose SSD (gp2)</a>
     * storage volume type.
     * </p>
     * </note>
     */
    private Integer volumeSizeInGB;
    /**
     * <p>
     * A key used by Amazon Web Services Key Management Service to encrypt data on the storage volume attached to the
     * compute instances used to run the training job. You can use either of the following formats to specify a key.
     * </p>
     * <p>
     * KMS Key ID:
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key:
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * <p>
     * Some instances use local storage, which use a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">hardware module to encrypt</a>
     * storage volumes. If you choose one of these instance types, you cannot request a <code>VolumeKmsKeyId</code>. For
     * a list of instance types that use local storage, see <a
     * href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>. For
     * more information about Amazon Web Services Key Management Service, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-kms-permissions.html">KMS encryption</a> for
     * more information.
     * </p>
     */
    private String volumeKmsKeyId;
    /**
     * <p>
     * The strategy that determines the order of preference for resources specified in <code>InstanceConfigs</code> used
     * in hyperparameter optimization.
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * A list containing the configuration(s) for one or more resources for processing hyperparameter jobs. These
     * resources include compute instances and storage volumes to use in model training jobs launched by hyperparameter
     * tuning jobs. The <code>AllocationStrategy</code> controls the order in which multiple configurations provided in
     * <code>InstanceConfigs</code> are used.
     * </p>
     * <note>
     * <p>
     * If you only want to use a single instance configuration inside the
     * <code>HyperParameterTuningResourceConfig</code> API, do not provide a value for <code>InstanceConfigs</code>.
     * Instead, use <code>InstanceType</code>, <code>VolumeSizeInGB</code> and <code>InstanceCount</code>. If you use
     * <code>InstanceConfigs</code>, do not provide values for <code>InstanceType</code>, <code>VolumeSizeInGB</code> or
     * <code>InstanceCount</code>.
     * </p>
     * </note>
     */
    private java.util.List<HyperParameterTuningInstanceConfig> instanceConfigs;

    /**
     * <p>
     * The instance type used to run hyperparameter optimization tuning jobs. See <a
     * href="https://docs.aws.amazon.com/notebooks-available-instance-types.html"> descriptions of instance types</a>
     * for more information.
     * </p>
     * 
     * @param instanceType
     *        The instance type used to run hyperparameter optimization tuning jobs. See <a
     *        href="https://docs.aws.amazon.com/notebooks-available-instance-types.html"> descriptions of instance
     *        types</a> for more information.
     * @see TrainingInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type used to run hyperparameter optimization tuning jobs. See <a
     * href="https://docs.aws.amazon.com/notebooks-available-instance-types.html"> descriptions of instance types</a>
     * for more information.
     * </p>
     * 
     * @return The instance type used to run hyperparameter optimization tuning jobs. See <a
     *         href="https://docs.aws.amazon.com/notebooks-available-instance-types.html"> descriptions of instance
     *         types</a> for more information.
     * @see TrainingInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type used to run hyperparameter optimization tuning jobs. See <a
     * href="https://docs.aws.amazon.com/notebooks-available-instance-types.html"> descriptions of instance types</a>
     * for more information.
     * </p>
     * 
     * @param instanceType
     *        The instance type used to run hyperparameter optimization tuning jobs. See <a
     *        href="https://docs.aws.amazon.com/notebooks-available-instance-types.html"> descriptions of instance
     *        types</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public HyperParameterTuningResourceConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type used to run hyperparameter optimization tuning jobs. See <a
     * href="https://docs.aws.amazon.com/notebooks-available-instance-types.html"> descriptions of instance types</a>
     * for more information.
     * </p>
     * 
     * @param instanceType
     *        The instance type used to run hyperparameter optimization tuning jobs. See <a
     *        href="https://docs.aws.amazon.com/notebooks-available-instance-types.html"> descriptions of instance
     *        types</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public HyperParameterTuningResourceConfig withInstanceType(TrainingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of compute instances of type <code>InstanceType</code> to use. For <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/data-parallel-use-api.html">distributed training</a>,
     * select a value greater than 1.
     * </p>
     * 
     * @param instanceCount
     *        The number of compute instances of type <code>InstanceType</code> to use. For <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/data-parallel-use-api.html">distributed
     *        training</a>, select a value greater than 1.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of compute instances of type <code>InstanceType</code> to use. For <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/data-parallel-use-api.html">distributed training</a>,
     * select a value greater than 1.
     * </p>
     * 
     * @return The number of compute instances of type <code>InstanceType</code> to use. For <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/data-parallel-use-api.html">distributed
     *         training</a>, select a value greater than 1.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of compute instances of type <code>InstanceType</code> to use. For <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/data-parallel-use-api.html">distributed training</a>,
     * select a value greater than 1.
     * </p>
     * 
     * @param instanceCount
     *        The number of compute instances of type <code>InstanceType</code> to use. For <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/data-parallel-use-api.html">distributed
     *        training</a>, select a value greater than 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningResourceConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The volume size in GB for the storage volume to be used in processing hyperparameter optimization jobs
     * (optional). These volumes store model artifacts, incremental states and optionally, scratch space for training
     * algorithms. Do not provide a value for this parameter if a value for <code>InstanceConfigs</code> is also
     * specified.
     * </p>
     * <p>
     * Some instance types have a fixed total local storage size. If you select one of these instances for training,
     * <code>VolumeSizeInGB</code> cannot be greater than this total size. For a list of instance types with local
     * instance storage and their sizes, see <a
     * href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>.
     * </p>
     * <note>
     * <p>
     * SageMaker supports only the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">General Purpose SSD (gp2)</a>
     * storage volume type.
     * </p>
     * </note>
     * 
     * @param volumeSizeInGB
     *        The volume size in GB for the storage volume to be used in processing hyperparameter optimization jobs
     *        (optional). These volumes store model artifacts, incremental states and optionally, scratch space for
     *        training algorithms. Do not provide a value for this parameter if a value for <code>InstanceConfigs</code>
     *        is also specified.</p>
     *        <p>
     *        Some instance types have a fixed total local storage size. If you select one of these instances for
     *        training, <code>VolumeSizeInGB</code> cannot be greater than this total size. For a list of instance types
     *        with local instance storage and their sizes, see <a
     *        href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>.
     *        </p>
     *        <note>
     *        <p>
     *        SageMaker supports only the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">General Purpose SSD
     *        (gp2)</a> storage volume type.
     *        </p>
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The volume size in GB for the storage volume to be used in processing hyperparameter optimization jobs
     * (optional). These volumes store model artifacts, incremental states and optionally, scratch space for training
     * algorithms. Do not provide a value for this parameter if a value for <code>InstanceConfigs</code> is also
     * specified.
     * </p>
     * <p>
     * Some instance types have a fixed total local storage size. If you select one of these instances for training,
     * <code>VolumeSizeInGB</code> cannot be greater than this total size. For a list of instance types with local
     * instance storage and their sizes, see <a
     * href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>.
     * </p>
     * <note>
     * <p>
     * SageMaker supports only the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">General Purpose SSD (gp2)</a>
     * storage volume type.
     * </p>
     * </note>
     * 
     * @return The volume size in GB for the storage volume to be used in processing hyperparameter optimization jobs
     *         (optional). These volumes store model artifacts, incremental states and optionally, scratch space for
     *         training algorithms. Do not provide a value for this parameter if a value for
     *         <code>InstanceConfigs</code> is also specified.</p>
     *         <p>
     *         Some instance types have a fixed total local storage size. If you select one of these instances for
     *         training, <code>VolumeSizeInGB</code> cannot be greater than this total size. For a list of instance
     *         types with local instance storage and their sizes, see <a
     *         href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store
     *         volumes</a>.
     *         </p>
     *         <note>
     *         <p>
     *         SageMaker supports only the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">General Purpose SSD
     *         (gp2)</a> storage volume type.
     *         </p>
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The volume size in GB for the storage volume to be used in processing hyperparameter optimization jobs
     * (optional). These volumes store model artifacts, incremental states and optionally, scratch space for training
     * algorithms. Do not provide a value for this parameter if a value for <code>InstanceConfigs</code> is also
     * specified.
     * </p>
     * <p>
     * Some instance types have a fixed total local storage size. If you select one of these instances for training,
     * <code>VolumeSizeInGB</code> cannot be greater than this total size. For a list of instance types with local
     * instance storage and their sizes, see <a
     * href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>.
     * </p>
     * <note>
     * <p>
     * SageMaker supports only the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">General Purpose SSD (gp2)</a>
     * storage volume type.
     * </p>
     * </note>
     * 
     * @param volumeSizeInGB
     *        The volume size in GB for the storage volume to be used in processing hyperparameter optimization jobs
     *        (optional). These volumes store model artifacts, incremental states and optionally, scratch space for
     *        training algorithms. Do not provide a value for this parameter if a value for <code>InstanceConfigs</code>
     *        is also specified.</p>
     *        <p>
     *        Some instance types have a fixed total local storage size. If you select one of these instances for
     *        training, <code>VolumeSizeInGB</code> cannot be greater than this total size. For a list of instance types
     *        with local instance storage and their sizes, see <a
     *        href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>.
     *        </p>
     *        <note>
     *        <p>
     *        SageMaker supports only the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html">General Purpose SSD
     *        (gp2)</a> storage volume type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningResourceConfig withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
        return this;
    }

    /**
     * <p>
     * A key used by Amazon Web Services Key Management Service to encrypt data on the storage volume attached to the
     * compute instances used to run the training job. You can use either of the following formats to specify a key.
     * </p>
     * <p>
     * KMS Key ID:
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key:
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * <p>
     * Some instances use local storage, which use a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">hardware module to encrypt</a>
     * storage volumes. If you choose one of these instance types, you cannot request a <code>VolumeKmsKeyId</code>. For
     * a list of instance types that use local storage, see <a
     * href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>. For
     * more information about Amazon Web Services Key Management Service, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-kms-permissions.html">KMS encryption</a> for
     * more information.
     * </p>
     * 
     * @param volumeKmsKeyId
     *        A key used by Amazon Web Services Key Management Service to encrypt data on the storage volume attached to
     *        the compute instances used to run the training job. You can use either of the following formats to specify
     *        a key.</p>
     *        <p>
     *        KMS Key ID:
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS key:
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        <p>
     *        Some instances use local storage, which use a <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">hardware module to
     *        encrypt</a> storage volumes. If you choose one of these instance types, you cannot request a
     *        <code>VolumeKmsKeyId</code>. For a list of instance types that use local storage, see <a
     *        href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>.
     *        For more information about Amazon Web Services Key Management Service, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-kms-permissions.html">KMS
     *        encryption</a> for more information.
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * A key used by Amazon Web Services Key Management Service to encrypt data on the storage volume attached to the
     * compute instances used to run the training job. You can use either of the following formats to specify a key.
     * </p>
     * <p>
     * KMS Key ID:
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key:
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * <p>
     * Some instances use local storage, which use a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">hardware module to encrypt</a>
     * storage volumes. If you choose one of these instance types, you cannot request a <code>VolumeKmsKeyId</code>. For
     * a list of instance types that use local storage, see <a
     * href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>. For
     * more information about Amazon Web Services Key Management Service, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-kms-permissions.html">KMS encryption</a> for
     * more information.
     * </p>
     * 
     * @return A key used by Amazon Web Services Key Management Service to encrypt data on the storage volume attached
     *         to the compute instances used to run the training job. You can use either of the following formats to
     *         specify a key.</p>
     *         <p>
     *         KMS Key ID:
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS key:
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         <p>
     *         Some instances use local storage, which use a <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">hardware module to
     *         encrypt</a> storage volumes. If you choose one of these instance types, you cannot request a
     *         <code>VolumeKmsKeyId</code>. For a list of instance types that use local storage, see <a
     *         href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store
     *         volumes</a>. For more information about Amazon Web Services Key Management Service, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-kms-permissions.html">KMS
     *         encryption</a> for more information.
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * A key used by Amazon Web Services Key Management Service to encrypt data on the storage volume attached to the
     * compute instances used to run the training job. You can use either of the following formats to specify a key.
     * </p>
     * <p>
     * KMS Key ID:
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key:
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * <p>
     * Some instances use local storage, which use a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">hardware module to encrypt</a>
     * storage volumes. If you choose one of these instance types, you cannot request a <code>VolumeKmsKeyId</code>. For
     * a list of instance types that use local storage, see <a
     * href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>. For
     * more information about Amazon Web Services Key Management Service, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-kms-permissions.html">KMS encryption</a> for
     * more information.
     * </p>
     * 
     * @param volumeKmsKeyId
     *        A key used by Amazon Web Services Key Management Service to encrypt data on the storage volume attached to
     *        the compute instances used to run the training job. You can use either of the following formats to specify
     *        a key.</p>
     *        <p>
     *        KMS Key ID:
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS key:
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        <p>
     *        Some instances use local storage, which use a <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">hardware module to
     *        encrypt</a> storage volumes. If you choose one of these instance types, you cannot request a
     *        <code>VolumeKmsKeyId</code>. For a list of instance types that use local storage, see <a
     *        href="http://aws.amazon.com/releasenotes/host-instance-storage-volumes-table/">instance store volumes</a>.
     *        For more information about Amazon Web Services Key Management Service, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-kms-permissions.html">KMS
     *        encryption</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningResourceConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The strategy that determines the order of preference for resources specified in <code>InstanceConfigs</code> used
     * in hyperparameter optimization.
     * </p>
     * 
     * @param allocationStrategy
     *        The strategy that determines the order of preference for resources specified in
     *        <code>InstanceConfigs</code> used in hyperparameter optimization.
     * @see HyperParameterTuningAllocationStrategy
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * The strategy that determines the order of preference for resources specified in <code>InstanceConfigs</code> used
     * in hyperparameter optimization.
     * </p>
     * 
     * @return The strategy that determines the order of preference for resources specified in
     *         <code>InstanceConfigs</code> used in hyperparameter optimization.
     * @see HyperParameterTuningAllocationStrategy
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * The strategy that determines the order of preference for resources specified in <code>InstanceConfigs</code> used
     * in hyperparameter optimization.
     * </p>
     * 
     * @param allocationStrategy
     *        The strategy that determines the order of preference for resources specified in
     *        <code>InstanceConfigs</code> used in hyperparameter optimization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningAllocationStrategy
     */

    public HyperParameterTuningResourceConfig withAllocationStrategy(String allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
        return this;
    }

    /**
     * <p>
     * The strategy that determines the order of preference for resources specified in <code>InstanceConfigs</code> used
     * in hyperparameter optimization.
     * </p>
     * 
     * @param allocationStrategy
     *        The strategy that determines the order of preference for resources specified in
     *        <code>InstanceConfigs</code> used in hyperparameter optimization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningAllocationStrategy
     */

    public HyperParameterTuningResourceConfig withAllocationStrategy(HyperParameterTuningAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * A list containing the configuration(s) for one or more resources for processing hyperparameter jobs. These
     * resources include compute instances and storage volumes to use in model training jobs launched by hyperparameter
     * tuning jobs. The <code>AllocationStrategy</code> controls the order in which multiple configurations provided in
     * <code>InstanceConfigs</code> are used.
     * </p>
     * <note>
     * <p>
     * If you only want to use a single instance configuration inside the
     * <code>HyperParameterTuningResourceConfig</code> API, do not provide a value for <code>InstanceConfigs</code>.
     * Instead, use <code>InstanceType</code>, <code>VolumeSizeInGB</code> and <code>InstanceCount</code>. If you use
     * <code>InstanceConfigs</code>, do not provide values for <code>InstanceType</code>, <code>VolumeSizeInGB</code> or
     * <code>InstanceCount</code>.
     * </p>
     * </note>
     * 
     * @return A list containing the configuration(s) for one or more resources for processing hyperparameter jobs.
     *         These resources include compute instances and storage volumes to use in model training jobs launched by
     *         hyperparameter tuning jobs. The <code>AllocationStrategy</code> controls the order in which multiple
     *         configurations provided in <code>InstanceConfigs</code> are used.</p> <note>
     *         <p>
     *         If you only want to use a single instance configuration inside the
     *         <code>HyperParameterTuningResourceConfig</code> API, do not provide a value for
     *         <code>InstanceConfigs</code>. Instead, use <code>InstanceType</code>, <code>VolumeSizeInGB</code> and
     *         <code>InstanceCount</code>. If you use <code>InstanceConfigs</code>, do not provide values for
     *         <code>InstanceType</code>, <code>VolumeSizeInGB</code> or <code>InstanceCount</code>.
     *         </p>
     */

    public java.util.List<HyperParameterTuningInstanceConfig> getInstanceConfigs() {
        return instanceConfigs;
    }

    /**
     * <p>
     * A list containing the configuration(s) for one or more resources for processing hyperparameter jobs. These
     * resources include compute instances and storage volumes to use in model training jobs launched by hyperparameter
     * tuning jobs. The <code>AllocationStrategy</code> controls the order in which multiple configurations provided in
     * <code>InstanceConfigs</code> are used.
     * </p>
     * <note>
     * <p>
     * If you only want to use a single instance configuration inside the
     * <code>HyperParameterTuningResourceConfig</code> API, do not provide a value for <code>InstanceConfigs</code>.
     * Instead, use <code>InstanceType</code>, <code>VolumeSizeInGB</code> and <code>InstanceCount</code>. If you use
     * <code>InstanceConfigs</code>, do not provide values for <code>InstanceType</code>, <code>VolumeSizeInGB</code> or
     * <code>InstanceCount</code>.
     * </p>
     * </note>
     * 
     * @param instanceConfigs
     *        A list containing the configuration(s) for one or more resources for processing hyperparameter jobs. These
     *        resources include compute instances and storage volumes to use in model training jobs launched by
     *        hyperparameter tuning jobs. The <code>AllocationStrategy</code> controls the order in which multiple
     *        configurations provided in <code>InstanceConfigs</code> are used.</p> <note>
     *        <p>
     *        If you only want to use a single instance configuration inside the
     *        <code>HyperParameterTuningResourceConfig</code> API, do not provide a value for
     *        <code>InstanceConfigs</code>. Instead, use <code>InstanceType</code>, <code>VolumeSizeInGB</code> and
     *        <code>InstanceCount</code>. If you use <code>InstanceConfigs</code>, do not provide values for
     *        <code>InstanceType</code>, <code>VolumeSizeInGB</code> or <code>InstanceCount</code>.
     *        </p>
     */

    public void setInstanceConfigs(java.util.Collection<HyperParameterTuningInstanceConfig> instanceConfigs) {
        if (instanceConfigs == null) {
            this.instanceConfigs = null;
            return;
        }

        this.instanceConfigs = new java.util.ArrayList<HyperParameterTuningInstanceConfig>(instanceConfigs);
    }

    /**
     * <p>
     * A list containing the configuration(s) for one or more resources for processing hyperparameter jobs. These
     * resources include compute instances and storage volumes to use in model training jobs launched by hyperparameter
     * tuning jobs. The <code>AllocationStrategy</code> controls the order in which multiple configurations provided in
     * <code>InstanceConfigs</code> are used.
     * </p>
     * <note>
     * <p>
     * If you only want to use a single instance configuration inside the
     * <code>HyperParameterTuningResourceConfig</code> API, do not provide a value for <code>InstanceConfigs</code>.
     * Instead, use <code>InstanceType</code>, <code>VolumeSizeInGB</code> and <code>InstanceCount</code>. If you use
     * <code>InstanceConfigs</code>, do not provide values for <code>InstanceType</code>, <code>VolumeSizeInGB</code> or
     * <code>InstanceCount</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceConfigs(java.util.Collection)} or {@link #withInstanceConfigs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param instanceConfigs
     *        A list containing the configuration(s) for one or more resources for processing hyperparameter jobs. These
     *        resources include compute instances and storage volumes to use in model training jobs launched by
     *        hyperparameter tuning jobs. The <code>AllocationStrategy</code> controls the order in which multiple
     *        configurations provided in <code>InstanceConfigs</code> are used.</p> <note>
     *        <p>
     *        If you only want to use a single instance configuration inside the
     *        <code>HyperParameterTuningResourceConfig</code> API, do not provide a value for
     *        <code>InstanceConfigs</code>. Instead, use <code>InstanceType</code>, <code>VolumeSizeInGB</code> and
     *        <code>InstanceCount</code>. If you use <code>InstanceConfigs</code>, do not provide values for
     *        <code>InstanceType</code>, <code>VolumeSizeInGB</code> or <code>InstanceCount</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningResourceConfig withInstanceConfigs(HyperParameterTuningInstanceConfig... instanceConfigs) {
        if (this.instanceConfigs == null) {
            setInstanceConfigs(new java.util.ArrayList<HyperParameterTuningInstanceConfig>(instanceConfigs.length));
        }
        for (HyperParameterTuningInstanceConfig ele : instanceConfigs) {
            this.instanceConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the configuration(s) for one or more resources for processing hyperparameter jobs. These
     * resources include compute instances and storage volumes to use in model training jobs launched by hyperparameter
     * tuning jobs. The <code>AllocationStrategy</code> controls the order in which multiple configurations provided in
     * <code>InstanceConfigs</code> are used.
     * </p>
     * <note>
     * <p>
     * If you only want to use a single instance configuration inside the
     * <code>HyperParameterTuningResourceConfig</code> API, do not provide a value for <code>InstanceConfigs</code>.
     * Instead, use <code>InstanceType</code>, <code>VolumeSizeInGB</code> and <code>InstanceCount</code>. If you use
     * <code>InstanceConfigs</code>, do not provide values for <code>InstanceType</code>, <code>VolumeSizeInGB</code> or
     * <code>InstanceCount</code>.
     * </p>
     * </note>
     * 
     * @param instanceConfigs
     *        A list containing the configuration(s) for one or more resources for processing hyperparameter jobs. These
     *        resources include compute instances and storage volumes to use in model training jobs launched by
     *        hyperparameter tuning jobs. The <code>AllocationStrategy</code> controls the order in which multiple
     *        configurations provided in <code>InstanceConfigs</code> are used.</p> <note>
     *        <p>
     *        If you only want to use a single instance configuration inside the
     *        <code>HyperParameterTuningResourceConfig</code> API, do not provide a value for
     *        <code>InstanceConfigs</code>. Instead, use <code>InstanceType</code>, <code>VolumeSizeInGB</code> and
     *        <code>InstanceCount</code>. If you use <code>InstanceConfigs</code>, do not provide values for
     *        <code>InstanceType</code>, <code>VolumeSizeInGB</code> or <code>InstanceCount</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningResourceConfig withInstanceConfigs(java.util.Collection<HyperParameterTuningInstanceConfig> instanceConfigs) {
        setInstanceConfigs(instanceConfigs);
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
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB()).append(",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId()).append(",");
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: ").append(getAllocationStrategy()).append(",");
        if (getInstanceConfigs() != null)
            sb.append("InstanceConfigs: ").append(getInstanceConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTuningResourceConfig == false)
            return false;
        HyperParameterTuningResourceConfig other = (HyperParameterTuningResourceConfig) obj;
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
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getInstanceConfigs() == null ^ this.getInstanceConfigs() == null)
            return false;
        if (other.getInstanceConfigs() != null && other.getInstanceConfigs().equals(this.getInstanceConfigs()) == false)
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
        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getInstanceConfigs() == null) ? 0 : getInstanceConfigs().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterTuningResourceConfig clone() {
        try {
            return (HyperParameterTuningResourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTuningResourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
