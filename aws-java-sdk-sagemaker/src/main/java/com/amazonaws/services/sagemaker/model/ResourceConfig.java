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
 * Describes the resources, including machine learning (ML) compute instances and ML storage volumes, to use for model
 * training.
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
     * <note>
     * <p>
     * SageMaker Training on Amazon Elastic Compute Cloud (EC2) P4de instances is in preview release starting December
     * 9th, 2022.
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/ec2/instance-types/p4/">Amazon EC2 P4de instances</a> (currently in preview) are
     * powered by 8 NVIDIA A100 GPUs with 80GB high-performance HBM2e GPU memory, which accelerate the speed of training
     * ML models that need to be trained on large datasets of high-resolution data. In this preview release, Amazon
     * SageMaker supports ML training jobs on P4de instances (<code>ml.p4de.24xlarge</code>) to reduce model training
     * time. The <code>ml.p4de.24xlarge</code> instances are available in the following Amazon Web Services Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To request quota limit increase and start using P4de instances, contact the SageMaker Training service team
     * through your account team.
     * </p>
     * </note>
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
     * When using an ML instance with <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html#nvme-ssd-volumes">NVMe SSD
     * volumes</a>, SageMaker doesn't provision Amazon EBS General Purpose SSD (gp2) storage. Available storage is fixed
     * to the NVMe-type instance's storage capacity. SageMaker configures storage paths for training datasets,
     * checkpoints, model artifacts, and outputs to use the entire capacity of the instance storage. For example, ML
     * instance families with the NVMe-type instance storage include <code>ml.p4d</code>, <code>ml.g4dn</code>, and
     * <code>ml.g5</code>.
     * </p>
     * <p>
     * When using an ML instance with the EBS-only storage option and without instance storage, you must define the size
     * of EBS volume through <code>VolumeSizeInGB</code> in the <code>ResourceConfig</code> API. For example, ML
     * instance families that use EBS volumes include <code>ml.c5</code> and <code>ml.p2</code>.
     * </p>
     * <p>
     * To look up instance types and their instance storage types and volumes, see <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>.
     * </p>
     * <p>
     * To find the default local paths defined by the SageMaker training platform, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-train-storage.html">Amazon SageMaker Training Storage
     * Folders for Training Datasets, Checkpoints, Model Artifacts, and Outputs</a>.
     * </p>
     */
    private Integer volumeSizeInGB;
    /**
     * <p>
     * The Amazon Web Services KMS key that SageMaker uses to encrypt data on the storage volume attached to the ML
     * compute instance(s) that run the training job.
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the instance type. Local storage volumes are
     * encrypted using a hardware module on the instance. You can't request a <code>VolumeKmsKeyId</code> when using an
     * instance type with local storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes">Instance
     * Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">SSD Instance Store
     * Volumes</a>.
     * </p>
     * </note>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be in any of the following formats:
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
     * The configuration of a heterogeneous cluster in JSON format.
     * </p>
     */
    private java.util.List<InstanceGroup> instanceGroups;
    /**
     * <p>
     * The duration of time in seconds to retain configured resources in a warm pool for subsequent training jobs.
     * </p>
     */
    private Integer keepAlivePeriodInSeconds;

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <note>
     * <p>
     * SageMaker Training on Amazon Elastic Compute Cloud (EC2) P4de instances is in preview release starting December
     * 9th, 2022.
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/ec2/instance-types/p4/">Amazon EC2 P4de instances</a> (currently in preview) are
     * powered by 8 NVIDIA A100 GPUs with 80GB high-performance HBM2e GPU memory, which accelerate the speed of training
     * ML models that need to be trained on large datasets of high-resolution data. In this preview release, Amazon
     * SageMaker supports ML training jobs on P4de instances (<code>ml.p4de.24xlarge</code>) to reduce model training
     * time. The <code>ml.p4de.24xlarge</code> instances are available in the following Amazon Web Services Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To request quota limit increase and start using P4de instances, contact the SageMaker Training service team
     * through your account team.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The ML compute instance type. </p> <note>
     *        <p>
     *        SageMaker Training on Amazon Elastic Compute Cloud (EC2) P4de instances is in preview release starting
     *        December 9th, 2022.
     *        </p>
     *        <p>
     *        <a href="http://aws.amazon.com/ec2/instance-types/p4/">Amazon EC2 P4de instances</a> (currently in
     *        preview) are powered by 8 NVIDIA A100 GPUs with 80GB high-performance HBM2e GPU memory, which accelerate
     *        the speed of training ML models that need to be trained on large datasets of high-resolution data. In this
     *        preview release, Amazon SageMaker supports ML training jobs on P4de instances (
     *        <code>ml.p4de.24xlarge</code>) to reduce model training time. The <code>ml.p4de.24xlarge</code> instances
     *        are available in the following Amazon Web Services Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (us-east-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (us-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To request quota limit increase and start using P4de instances, contact the SageMaker Training service
     *        team through your account team.
     *        </p>
     * @see TrainingInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <note>
     * <p>
     * SageMaker Training on Amazon Elastic Compute Cloud (EC2) P4de instances is in preview release starting December
     * 9th, 2022.
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/ec2/instance-types/p4/">Amazon EC2 P4de instances</a> (currently in preview) are
     * powered by 8 NVIDIA A100 GPUs with 80GB high-performance HBM2e GPU memory, which accelerate the speed of training
     * ML models that need to be trained on large datasets of high-resolution data. In this preview release, Amazon
     * SageMaker supports ML training jobs on P4de instances (<code>ml.p4de.24xlarge</code>) to reduce model training
     * time. The <code>ml.p4de.24xlarge</code> instances are available in the following Amazon Web Services Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To request quota limit increase and start using P4de instances, contact the SageMaker Training service team
     * through your account team.
     * </p>
     * </note>
     * 
     * @return The ML compute instance type. </p> <note>
     *         <p>
     *         SageMaker Training on Amazon Elastic Compute Cloud (EC2) P4de instances is in preview release starting
     *         December 9th, 2022.
     *         </p>
     *         <p>
     *         <a href="http://aws.amazon.com/ec2/instance-types/p4/">Amazon EC2 P4de instances</a> (currently in
     *         preview) are powered by 8 NVIDIA A100 GPUs with 80GB high-performance HBM2e GPU memory, which accelerate
     *         the speed of training ML models that need to be trained on large datasets of high-resolution data. In
     *         this preview release, Amazon SageMaker supports ML training jobs on P4de instances (
     *         <code>ml.p4de.24xlarge</code>) to reduce model training time. The <code>ml.p4de.24xlarge</code> instances
     *         are available in the following Amazon Web Services Regions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         US East (N. Virginia) (us-east-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (Oregon) (us-west-2)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To request quota limit increase and start using P4de instances, contact the SageMaker Training service
     *         team through your account team.
     *         </p>
     * @see TrainingInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <note>
     * <p>
     * SageMaker Training on Amazon Elastic Compute Cloud (EC2) P4de instances is in preview release starting December
     * 9th, 2022.
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/ec2/instance-types/p4/">Amazon EC2 P4de instances</a> (currently in preview) are
     * powered by 8 NVIDIA A100 GPUs with 80GB high-performance HBM2e GPU memory, which accelerate the speed of training
     * ML models that need to be trained on large datasets of high-resolution data. In this preview release, Amazon
     * SageMaker supports ML training jobs on P4de instances (<code>ml.p4de.24xlarge</code>) to reduce model training
     * time. The <code>ml.p4de.24xlarge</code> instances are available in the following Amazon Web Services Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To request quota limit increase and start using P4de instances, contact the SageMaker Training service team
     * through your account team.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The ML compute instance type. </p> <note>
     *        <p>
     *        SageMaker Training on Amazon Elastic Compute Cloud (EC2) P4de instances is in preview release starting
     *        December 9th, 2022.
     *        </p>
     *        <p>
     *        <a href="http://aws.amazon.com/ec2/instance-types/p4/">Amazon EC2 P4de instances</a> (currently in
     *        preview) are powered by 8 NVIDIA A100 GPUs with 80GB high-performance HBM2e GPU memory, which accelerate
     *        the speed of training ML models that need to be trained on large datasets of high-resolution data. In this
     *        preview release, Amazon SageMaker supports ML training jobs on P4de instances (
     *        <code>ml.p4de.24xlarge</code>) to reduce model training time. The <code>ml.p4de.24xlarge</code> instances
     *        are available in the following Amazon Web Services Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (us-east-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (us-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To request quota limit increase and start using P4de instances, contact the SageMaker Training service
     *        team through your account team.
     *        </p>
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
     * <note>
     * <p>
     * SageMaker Training on Amazon Elastic Compute Cloud (EC2) P4de instances is in preview release starting December
     * 9th, 2022.
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/ec2/instance-types/p4/">Amazon EC2 P4de instances</a> (currently in preview) are
     * powered by 8 NVIDIA A100 GPUs with 80GB high-performance HBM2e GPU memory, which accelerate the speed of training
     * ML models that need to be trained on large datasets of high-resolution data. In this preview release, Amazon
     * SageMaker supports ML training jobs on P4de instances (<code>ml.p4de.24xlarge</code>) to reduce model training
     * time. The <code>ml.p4de.24xlarge</code> instances are available in the following Amazon Web Services Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (us-east-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (us-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To request quota limit increase and start using P4de instances, contact the SageMaker Training service team
     * through your account team.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The ML compute instance type. </p> <note>
     *        <p>
     *        SageMaker Training on Amazon Elastic Compute Cloud (EC2) P4de instances is in preview release starting
     *        December 9th, 2022.
     *        </p>
     *        <p>
     *        <a href="http://aws.amazon.com/ec2/instance-types/p4/">Amazon EC2 P4de instances</a> (currently in
     *        preview) are powered by 8 NVIDIA A100 GPUs with 80GB high-performance HBM2e GPU memory, which accelerate
     *        the speed of training ML models that need to be trained on large datasets of high-resolution data. In this
     *        preview release, Amazon SageMaker supports ML training jobs on P4de instances (
     *        <code>ml.p4de.24xlarge</code>) to reduce model training time. The <code>ml.p4de.24xlarge</code> instances
     *        are available in the following Amazon Web Services Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (us-east-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (us-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To request quota limit increase and start using P4de instances, contact the SageMaker Training service
     *        team through your account team.
     *        </p>
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
     * When using an ML instance with <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html#nvme-ssd-volumes">NVMe SSD
     * volumes</a>, SageMaker doesn't provision Amazon EBS General Purpose SSD (gp2) storage. Available storage is fixed
     * to the NVMe-type instance's storage capacity. SageMaker configures storage paths for training datasets,
     * checkpoints, model artifacts, and outputs to use the entire capacity of the instance storage. For example, ML
     * instance families with the NVMe-type instance storage include <code>ml.p4d</code>, <code>ml.g4dn</code>, and
     * <code>ml.g5</code>.
     * </p>
     * <p>
     * When using an ML instance with the EBS-only storage option and without instance storage, you must define the size
     * of EBS volume through <code>VolumeSizeInGB</code> in the <code>ResourceConfig</code> API. For example, ML
     * instance families that use EBS volumes include <code>ml.c5</code> and <code>ml.p2</code>.
     * </p>
     * <p>
     * To look up instance types and their instance storage types and volumes, see <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>.
     * </p>
     * <p>
     * To find the default local paths defined by the SageMaker training platform, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-train-storage.html">Amazon SageMaker Training Storage
     * Folders for Training Datasets, Checkpoints, Model Artifacts, and Outputs</a>.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size of the ML storage volume that you want to provision. </p>
     *        <p>
     *        ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML
     *        storage volume for scratch space. If you want to store the training data in the ML storage volume, choose
     *        <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     *        </p>
     *        <p>
     *        When using an ML instance with <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html#nvme-ssd-volumes">NVMe
     *        SSD volumes</a>, SageMaker doesn't provision Amazon EBS General Purpose SSD (gp2) storage. Available
     *        storage is fixed to the NVMe-type instance's storage capacity. SageMaker configures storage paths for
     *        training datasets, checkpoints, model artifacts, and outputs to use the entire capacity of the instance
     *        storage. For example, ML instance families with the NVMe-type instance storage include <code>ml.p4d</code>, <code>ml.g4dn</code>, and <code>ml.g5</code>.
     *        </p>
     *        <p>
     *        When using an ML instance with the EBS-only storage option and without instance storage, you must define
     *        the size of EBS volume through <code>VolumeSizeInGB</code> in the <code>ResourceConfig</code> API. For
     *        example, ML instance families that use EBS volumes include <code>ml.c5</code> and <code>ml.p2</code>.
     *        </p>
     *        <p>
     *        To look up instance types and their instance storage types and volumes, see <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>.
     *        </p>
     *        <p>
     *        To find the default local paths defined by the SageMaker training platform, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-train-storage.html">Amazon SageMaker Training
     *        Storage Folders for Training Datasets, Checkpoints, Model Artifacts, and Outputs</a>.
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
     * When using an ML instance with <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html#nvme-ssd-volumes">NVMe SSD
     * volumes</a>, SageMaker doesn't provision Amazon EBS General Purpose SSD (gp2) storage. Available storage is fixed
     * to the NVMe-type instance's storage capacity. SageMaker configures storage paths for training datasets,
     * checkpoints, model artifacts, and outputs to use the entire capacity of the instance storage. For example, ML
     * instance families with the NVMe-type instance storage include <code>ml.p4d</code>, <code>ml.g4dn</code>, and
     * <code>ml.g5</code>.
     * </p>
     * <p>
     * When using an ML instance with the EBS-only storage option and without instance storage, you must define the size
     * of EBS volume through <code>VolumeSizeInGB</code> in the <code>ResourceConfig</code> API. For example, ML
     * instance families that use EBS volumes include <code>ml.c5</code> and <code>ml.p2</code>.
     * </p>
     * <p>
     * To look up instance types and their instance storage types and volumes, see <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>.
     * </p>
     * <p>
     * To find the default local paths defined by the SageMaker training platform, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-train-storage.html">Amazon SageMaker Training Storage
     * Folders for Training Datasets, Checkpoints, Model Artifacts, and Outputs</a>.
     * </p>
     * 
     * @return The size of the ML storage volume that you want to provision. </p>
     *         <p>
     *         ML storage volumes store model artifacts and incremental states. Training algorithms might also use the
     *         ML storage volume for scratch space. If you want to store the training data in the ML storage volume,
     *         choose <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     *         </p>
     *         <p>
     *         When using an ML instance with <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html#nvme-ssd-volumes">NVMe
     *         SSD volumes</a>, SageMaker doesn't provision Amazon EBS General Purpose SSD (gp2) storage. Available
     *         storage is fixed to the NVMe-type instance's storage capacity. SageMaker configures storage paths for
     *         training datasets, checkpoints, model artifacts, and outputs to use the entire capacity of the instance
     *         storage. For example, ML instance families with the NVMe-type instance storage include
     *         <code>ml.p4d</code>, <code>ml.g4dn</code>, and <code>ml.g5</code>.
     *         </p>
     *         <p>
     *         When using an ML instance with the EBS-only storage option and without instance storage, you must define
     *         the size of EBS volume through <code>VolumeSizeInGB</code> in the <code>ResourceConfig</code> API. For
     *         example, ML instance families that use EBS volumes include <code>ml.c5</code> and <code>ml.p2</code>.
     *         </p>
     *         <p>
     *         To look up instance types and their instance storage types and volumes, see <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>.
     *         </p>
     *         <p>
     *         To find the default local paths defined by the SageMaker training platform, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-train-storage.html">Amazon SageMaker Training
     *         Storage Folders for Training Datasets, Checkpoints, Model Artifacts, and Outputs</a>.
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
     * When using an ML instance with <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html#nvme-ssd-volumes">NVMe SSD
     * volumes</a>, SageMaker doesn't provision Amazon EBS General Purpose SSD (gp2) storage. Available storage is fixed
     * to the NVMe-type instance's storage capacity. SageMaker configures storage paths for training datasets,
     * checkpoints, model artifacts, and outputs to use the entire capacity of the instance storage. For example, ML
     * instance families with the NVMe-type instance storage include <code>ml.p4d</code>, <code>ml.g4dn</code>, and
     * <code>ml.g5</code>.
     * </p>
     * <p>
     * When using an ML instance with the EBS-only storage option and without instance storage, you must define the size
     * of EBS volume through <code>VolumeSizeInGB</code> in the <code>ResourceConfig</code> API. For example, ML
     * instance families that use EBS volumes include <code>ml.c5</code> and <code>ml.p2</code>.
     * </p>
     * <p>
     * To look up instance types and their instance storage types and volumes, see <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>.
     * </p>
     * <p>
     * To find the default local paths defined by the SageMaker training platform, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-train-storage.html">Amazon SageMaker Training Storage
     * Folders for Training Datasets, Checkpoints, Model Artifacts, and Outputs</a>.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size of the ML storage volume that you want to provision. </p>
     *        <p>
     *        ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML
     *        storage volume for scratch space. If you want to store the training data in the ML storage volume, choose
     *        <code>File</code> as the <code>TrainingInputMode</code> in the algorithm specification.
     *        </p>
     *        <p>
     *        When using an ML instance with <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html#nvme-ssd-volumes">NVMe
     *        SSD volumes</a>, SageMaker doesn't provision Amazon EBS General Purpose SSD (gp2) storage. Available
     *        storage is fixed to the NVMe-type instance's storage capacity. SageMaker configures storage paths for
     *        training datasets, checkpoints, model artifacts, and outputs to use the entire capacity of the instance
     *        storage. For example, ML instance families with the NVMe-type instance storage include <code>ml.p4d</code>, <code>ml.g4dn</code>, and <code>ml.g5</code>.
     *        </p>
     *        <p>
     *        When using an ML instance with the EBS-only storage option and without instance storage, you must define
     *        the size of EBS volume through <code>VolumeSizeInGB</code> in the <code>ResourceConfig</code> API. For
     *        example, ML instance families that use EBS volumes include <code>ml.c5</code> and <code>ml.p2</code>.
     *        </p>
     *        <p>
     *        To look up instance types and their instance storage types and volumes, see <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>.
     *        </p>
     *        <p>
     *        To find the default local paths defined by the SageMaker training platform, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-train-storage.html">Amazon SageMaker Training
     *        Storage Folders for Training Datasets, Checkpoints, Model Artifacts, and Outputs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceConfig withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key that SageMaker uses to encrypt data on the storage volume attached to the ML
     * compute instance(s) that run the training job.
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the instance type. Local storage volumes are
     * encrypted using a hardware module on the instance. You can't request a <code>VolumeKmsKeyId</code> when using an
     * instance type with local storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes">Instance
     * Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">SSD Instance Store
     * Volumes</a>.
     * </p>
     * </note>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be in any of the following formats:
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
     *        The Amazon Web Services KMS key that SageMaker uses to encrypt data on the storage volume attached to the
     *        ML compute instance(s) that run the training job.</p> <note>
     *        <p>
     *        Certain Nitro-based instances include local storage, dependent on the instance type. Local storage volumes
     *        are encrypted using a hardware module on the instance. You can't request a <code>VolumeKmsKeyId</code>
     *        when using an instance type with local storage.
     *        </p>
     *        <p>
     *        For a list of instance types that support local instance storage, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *        >Instance Store Volumes</a>.
     *        </p>
     *        <p>
     *        For more information about local instance storage encryption, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">SSD Instance Store
     *        Volumes</a>.
     *        </p>
     *        </note>
     *        <p>
     *        The <code>VolumeKmsKeyId</code> can be in any of the following formats:
     *        </p>
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
     * The Amazon Web Services KMS key that SageMaker uses to encrypt data on the storage volume attached to the ML
     * compute instance(s) that run the training job.
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the instance type. Local storage volumes are
     * encrypted using a hardware module on the instance. You can't request a <code>VolumeKmsKeyId</code> when using an
     * instance type with local storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes">Instance
     * Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">SSD Instance Store
     * Volumes</a>.
     * </p>
     * </note>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be in any of the following formats:
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
     * @return The Amazon Web Services KMS key that SageMaker uses to encrypt data on the storage volume attached to the
     *         ML compute instance(s) that run the training job.</p> <note>
     *         <p>
     *         Certain Nitro-based instances include local storage, dependent on the instance type. Local storage
     *         volumes are encrypted using a hardware module on the instance. You can't request a
     *         <code>VolumeKmsKeyId</code> when using an instance type with local storage.
     *         </p>
     *         <p>
     *         For a list of instance types that support local instance storage, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *         >Instance Store Volumes</a>.
     *         </p>
     *         <p>
     *         For more information about local instance storage encryption, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">SSD Instance Store
     *         Volumes</a>.
     *         </p>
     *         </note>
     *         <p>
     *         The <code>VolumeKmsKeyId</code> can be in any of the following formats:
     *         </p>
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
     * The Amazon Web Services KMS key that SageMaker uses to encrypt data on the storage volume attached to the ML
     * compute instance(s) that run the training job.
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the instance type. Local storage volumes are
     * encrypted using a hardware module on the instance. You can't request a <code>VolumeKmsKeyId</code> when using an
     * instance type with local storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes">Instance
     * Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">SSD Instance Store
     * Volumes</a>.
     * </p>
     * </note>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be in any of the following formats:
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
     *        The Amazon Web Services KMS key that SageMaker uses to encrypt data on the storage volume attached to the
     *        ML compute instance(s) that run the training job.</p> <note>
     *        <p>
     *        Certain Nitro-based instances include local storage, dependent on the instance type. Local storage volumes
     *        are encrypted using a hardware module on the instance. You can't request a <code>VolumeKmsKeyId</code>
     *        when using an instance type with local storage.
     *        </p>
     *        <p>
     *        For a list of instance types that support local instance storage, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *        >Instance Store Volumes</a>.
     *        </p>
     *        <p>
     *        For more information about local instance storage encryption, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html">SSD Instance Store
     *        Volumes</a>.
     *        </p>
     *        </note>
     *        <p>
     *        The <code>VolumeKmsKeyId</code> can be in any of the following formats:
     *        </p>
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

    public ResourceConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The configuration of a heterogeneous cluster in JSON format.
     * </p>
     * 
     * @return The configuration of a heterogeneous cluster in JSON format.
     */

    public java.util.List<InstanceGroup> getInstanceGroups() {
        return instanceGroups;
    }

    /**
     * <p>
     * The configuration of a heterogeneous cluster in JSON format.
     * </p>
     * 
     * @param instanceGroups
     *        The configuration of a heterogeneous cluster in JSON format.
     */

    public void setInstanceGroups(java.util.Collection<InstanceGroup> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new java.util.ArrayList<InstanceGroup>(instanceGroups);
    }

    /**
     * <p>
     * The configuration of a heterogeneous cluster in JSON format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGroups(java.util.Collection)} or {@link #withInstanceGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceGroups
     *        The configuration of a heterogeneous cluster in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceConfig withInstanceGroups(InstanceGroup... instanceGroups) {
        if (this.instanceGroups == null) {
            setInstanceGroups(new java.util.ArrayList<InstanceGroup>(instanceGroups.length));
        }
        for (InstanceGroup ele : instanceGroups) {
            this.instanceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of a heterogeneous cluster in JSON format.
     * </p>
     * 
     * @param instanceGroups
     *        The configuration of a heterogeneous cluster in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceConfig withInstanceGroups(java.util.Collection<InstanceGroup> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
    }

    /**
     * <p>
     * The duration of time in seconds to retain configured resources in a warm pool for subsequent training jobs.
     * </p>
     * 
     * @param keepAlivePeriodInSeconds
     *        The duration of time in seconds to retain configured resources in a warm pool for subsequent training
     *        jobs.
     */

    public void setKeepAlivePeriodInSeconds(Integer keepAlivePeriodInSeconds) {
        this.keepAlivePeriodInSeconds = keepAlivePeriodInSeconds;
    }

    /**
     * <p>
     * The duration of time in seconds to retain configured resources in a warm pool for subsequent training jobs.
     * </p>
     * 
     * @return The duration of time in seconds to retain configured resources in a warm pool for subsequent training
     *         jobs.
     */

    public Integer getKeepAlivePeriodInSeconds() {
        return this.keepAlivePeriodInSeconds;
    }

    /**
     * <p>
     * The duration of time in seconds to retain configured resources in a warm pool for subsequent training jobs.
     * </p>
     * 
     * @param keepAlivePeriodInSeconds
     *        The duration of time in seconds to retain configured resources in a warm pool for subsequent training
     *        jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceConfig withKeepAlivePeriodInSeconds(Integer keepAlivePeriodInSeconds) {
        setKeepAlivePeriodInSeconds(keepAlivePeriodInSeconds);
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
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: ").append(getInstanceGroups()).append(",");
        if (getKeepAlivePeriodInSeconds() != null)
            sb.append("KeepAlivePeriodInSeconds: ").append(getKeepAlivePeriodInSeconds());
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
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        if (other.getKeepAlivePeriodInSeconds() == null ^ this.getKeepAlivePeriodInSeconds() == null)
            return false;
        if (other.getKeepAlivePeriodInSeconds() != null && other.getKeepAlivePeriodInSeconds().equals(this.getKeepAlivePeriodInSeconds()) == false)
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
        hashCode = prime * hashCode + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode());
        hashCode = prime * hashCode + ((getKeepAlivePeriodInSeconds() == null) ? 0 : getKeepAlivePeriodInSeconds().hashCode());
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
